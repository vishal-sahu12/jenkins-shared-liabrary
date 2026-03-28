def call(){
    withCredentials([string(
        credentialsID: 'nvd-api-key',
        variable: 'NVD_KEY'
    )])
    dependencyCheck additionalArguments: '--scan ./  --nvdApikey ${NVD_KEY}', odcInstallation: 'OWASP'
    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
