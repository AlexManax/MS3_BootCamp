#!groovy
pipeline {
    agent none
    triggers { pollSCM {'* * * * *'}}
    options {
        buildDisccarder(logRotator(numToKeepStr: '10', artifactNumToKeepStr: '10'))
        timestumps()
    }
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
        stage('========== Kill_container ==========') {
             agent any
             steps {
                    sh 'docker stop MS3_BC_project || true'
                    }
        }
        stage('========== Deploy Project ==========') {
            agent any
            steps {
                sh 'docker build -t myorg/myapp .'
                sh 'docker run -d -p 8080:8080 --rm --network="net1" --name MS3_BC_project myorg/myapp:latest'
            }
        }
    }
}