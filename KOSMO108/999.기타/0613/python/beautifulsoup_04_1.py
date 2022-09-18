from bs4 import BeautifulSoup
import urllib.request as req

url = "http://naver.com"
res = req.urlopen(url)

soup = BeautifulSoup(res, 'html.parser')

links = soup.find_all("a")

for a in links:
    href = a.attrs['href']
    text = a.string
    print(text, ">", href)