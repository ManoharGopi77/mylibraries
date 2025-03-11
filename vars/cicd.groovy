def gitdownload(repo)
{
  git "https://github.com/ManoharGopi77/${repo}.git"
}
def build()
{
  sh "mvn package"
}
def deploytomcat(jobname,ip,context)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${context}.war"
}
