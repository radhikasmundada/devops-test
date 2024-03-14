pipeline{
    agent any
    stages{

        stage("Checkout for git")
        {
            steps{
            checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/radhikasmundada/devops-test']])
            }
        }
        stage("Building jar")
        {
            steps{
                sh "mvn clean install -DskipTests"
            }
        }
        stage("Deploy")
        {
            steps{
                sh "docker compose up --build"
            }
        }
    }
}