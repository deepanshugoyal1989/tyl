pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
               mvn clean
            }
        }
        stage('Test') {
            steps {
                mvn install
            }
        }
        stage('Deploy') {
            steps {
                echo "Deploy node"
            }
        }

    }
}