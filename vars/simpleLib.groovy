//node {
//  stage('java_version') {
//    checkJavaVer()
//}

def checkJavaVer () {
  sh 'java --version'
}
