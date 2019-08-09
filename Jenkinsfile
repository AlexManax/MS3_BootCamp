// #!groovy
pipeline {
    agent none
    stages {
        stage('========== Build Project ==========') {
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
        stage('========== Deploy Project ==========') {
            agent any
            steps {
                sh 'docker build -t myorg/myapp .'
                sh 'docker run -d -p --rm 8080:8080 --network="net1" --name MS3_BC_project myorg/myapp:latest'
            }
        }
    }
}