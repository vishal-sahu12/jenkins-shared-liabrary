def call (String username,String ImageName,String Version){
echo "This is Build File"
sh "docker build -t ${username}/${ImageName}:${Version} ."
}
