import requests

url = "http://192.168.219.152:8088/kosmoSpring/a.jsp"

res = requests.get(url)
print('res >>> : ', res)

python_html = res.text
print('ptynon_html >>> : \n', python_html)



