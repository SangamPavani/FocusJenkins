pipeline {

    agent any

    tools {

        jdk 'JDK'
        maven 'Maven'

    }

    triggers {

        pollSCM('H/2 * * * *')

    }

    environment {

        PATCH_FOLDER = 'G:/Patches'
        PROJECT_PATH = 'F:/FocusJenkins/SampleProject'

    }

    stages {

        stage('Clean Old Reports') {

            steps {

                dir("${PROJECT_PATH}") {

                    bat '''
                    if exist test-output rmdir /s /q test-output
                    if exist target rmdir /s /q target
                    '''

                }
            }
        }

        stage('Check Patch Folder') {

            steps {

                script {

                    def patchExists = bat(

                        script: """
                        IF EXIST "%PATCH_FOLDER%\\*.exe" (
                            EXIT /B 0
                        ) ELSE (
                            EXIT /B 1
                        )
                        """,

                        returnStatus: true

                    )

                    if (patchExists != 0) {

                        error "No patch found"

                    }
                }
            }
        }

       stage('Install Latest Patch') {

    steps {

        bat '''

        echo =========================
        echo CHECKING PATCH FOLDER
        echo =========================

        cd /d G:\\Patches

        dir *.exe /o-d

        echo =========================
        echo STARTING AUTOIT HANDLER
        echo =========================

        start "" PatchHandler.exe

        timeout /t 5

        echo =========================
        echo INSTALLING LATEST PATCH
        echo =========================

        for /f "delims=" %%f in ('dir *.exe /b /o-d') do (

            if /I NOT "%%f"=="PatchHandler.exe" (

                echo Running Patch: %%f

                start /wait "" "%%f"

                echo Patch Completed: %%f

                move "%%f" Completed\\

                goto :done
            )
        )

        :done

        echo =========================
        echo PATCH INSTALLATION FINISHED
        echo =========================

        '''
    }
}

        stage('Execute Automation') {

            steps {

                dir("${PROJECT_PATH}") {

                    bat '''

                    mvn clean test -Dsurefire.suiteXmlFiles=testng.xml

                    '''

                }
            }
        }
    }

    post {

        always {

            publishHTML([

                allowMissing: false,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'test-output',
                reportFiles: 'index.html',
                reportName: 'Automation Report'

            ])
        }
    }
}