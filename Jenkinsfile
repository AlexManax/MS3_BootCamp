// #!groovy
pipeline {
    agent none
    stages {
        stage('========== Project ==========') {
            agent {
                docker {
                    image 'maven:3-jdk-8'
                    args '-v $HOME/.m2:/root/.m2'
                }
            }
            steps {
                sh 'mvn clean package'
            }
        }
        stage('========== Test ==========') {
            agent any
            steps {
                sh 'docker build -t myorg/myapp .'
                sh 'docker run -d -p 8080:8080 --network="net1" --name MS3_BC_project myorg/myapp:latest'
            }
        }
    }
}