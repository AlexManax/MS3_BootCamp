// #!groovy
pipeline {
    agent none
//     triggers{ cron('* * * * *') }
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
//                 sh 'docker-compose down'
//                 sh 'docker-compose up --build -d'
                sh 'docker stop MS3_BC_project'
                sh 'docker build -t myorg/myapp .'
                sh 'docker run -d -p 8080:8080 --rm --network="net1" --name MS3_BC_project myorg/myapp:latest'
            }
        }
    }
}