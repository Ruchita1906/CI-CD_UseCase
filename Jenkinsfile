pipeline {
    agent { label 'windows_runner' }
    stages {
        stage('test') {
            steps {
                echo 'test start'
                dir('C:\\Users\\ruchi\\OneDrive\\Desktop\\CI-CD_UseCase') {
                    bat 'mvn test'
                }
                echo 'test end'
            }
            post {
                always {
                    archiveArtifacts artifacts: '**/target/surefire-reports/**/*.*', allowEmptyArchive: true
                }
            }
        }
    }
}
