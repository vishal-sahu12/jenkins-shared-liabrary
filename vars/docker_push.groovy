def call (String dockerUser,String dockerPass,String ImageName,String Version){
echo "This is Docker Push Liab"
sh "docker login -u ${dockerUser} -p ${dockerPass}"  
sh "docker push ${dockerUser}/${ImageName}:${Version}"
}
