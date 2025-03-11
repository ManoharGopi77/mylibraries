def gitdownload(repo)
{
  git "https://github.com/ManoharGopi77/${repo}.git"
}
def build()
{
  sh "mvn package"
}
