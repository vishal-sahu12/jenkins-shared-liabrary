def call (String ImageName,String Version){
withCredentials([usernamePassword(
                    credentialsId:"dockerhub",
                    usernameVariable:"dockerHubUser", 
                    passwordVariable:"dockerHubPass"
                    )]){
                sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
                sh "docker push ${env.dockerHubUser}/${ImageName}:${Version}"
}
}
