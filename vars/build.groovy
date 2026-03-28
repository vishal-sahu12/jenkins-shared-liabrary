def call (String ImageName,String Version){
echo "This is Build File"
withCredentials([usernamePassword(
                    credentialsId:'dockerhub',
                    usernameVariable:'dockerHubUser',
                    passwordVariable: 'dockerHubPass'
                    )]){
                sh "docker build -t ${env.dockerHubUser}/${ImageName}:${Version} ."
              
}
}
