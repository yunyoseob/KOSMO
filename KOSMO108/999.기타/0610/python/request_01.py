import requests

url = "https://www.python.org/"

res = requests.get(url)
print('res >>> : ', res)

python_html = res.text
print('ptynon_html >>> : \n', python_html)



