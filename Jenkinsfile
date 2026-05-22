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

        stage('Install Patch') {

    steps {

        bat '''
        echo =========================
        echo CHECKING PATCH FOLDER
        echo =========================

        cd /d G:\\Patches

        dir

        echo =========================
        echo INSTALLING PATCHES
        echo =========================

        for %%f in ("*.exe") do (

            echo Running: %%f

            start /wait "" "%%f"

            echo Completed: %%f
        )

        echo =========================
        echo PATCH INSTALL COMPLETED
        echo =========================
        '''
    }
}

        stage('Execute Automation') {

            steps {

                dir("${PROJECT_PATH}") {

                    bat 'mvn clean test -Dsurefire.suiteXmlFiles=testng.xml'

                }
            }
        }
    }

    post {

        always {

            publishHTML([
                allowMissing: true,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'test-output',
                reportFiles: 'index.html',
                reportName: 'Automation Report'
            ])
        }
    }
}