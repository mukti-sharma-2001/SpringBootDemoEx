pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }

    stages {
        stage('Clean') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main', url: 'https://github.com/mukti-sharma-2001/SpringBootDemoEx'

                // Run Maven on a Unix agent.
                //sh "mvn -Dmaven.test.failure.ignore=true clean package"
                echo 'maven clean'
                // To run Maven on a Windows agent, use
                bat "mvn -Dmaven.test.failure.ignore=true clean"
            }
        }
        stage('Compile') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main', url: 'https://github.com/mukti-sharma-2001/SpringBootDemoEx'

                // Run Maven on a Unix agent.
                //sh "mvn -Dmaven.test.failure.ignore=true clean package"
                echo 'maven compile'
                // To run Maven on a Windows agent, use
                bat "mvn -Dmaven.test.failure.ignore=true compile"
            }
        }
        stage('Test') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main', url: 'https://github.com/mukti-sharma-2001/SpringBootDemoEx'
                // Run Maven on a Unix agent.
                //sh "mvn -Dmaven.test.failure.ignore=true clean package"
                echo 'maven test'
                // To run Maven on a Windows agent, use
                bat "mvn -Dmaven.test.failure.ignore=true test"
            }
        }
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main', url: 'https://github.com/mukti-sharma-2001/SpringBootDemoEx'

                // Run Maven on a Unix agent.
                //sh "mvn -Dmaven.test.failure.ignore=true clean package"
                echo 'maven package'
                // To run Maven on a Windows agent, use
                bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }
        }
    }
        
    post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
        success {
                    echo 'all stages are successfull now junit test'
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
        }
    }
}
