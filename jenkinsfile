pipeline{
    agent any
    stages{
        stage("SCM"){
            steps{
                git credentialsId: 'Git_Credentials', url: 'https://github.com/sunkaravineeth/java-addTwoNumbers.git'
                 echo "Good morning"
            }
        }
    }
}
