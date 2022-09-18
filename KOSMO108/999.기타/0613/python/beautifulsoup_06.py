from bs4 import BeautifulSoup
import urllib.request as req

# url = "http://info.finance.naver.com/marketindex"
url = "https://finance.naver.com/marketindex/"
res = req.urlopen(url)

soup = BeautifulSoup(res, "html.parser")
print(soup)
#exchangeList > li.on > a.head.usd > div > span.value
price = soup.select_one("div.head_info > span.value").string
print("usd/krw = ", price)

#oilGoldList > li:nth-child(2) > a.head.gasoline > div > span.value
#oilGoldList > li.on > a.head.gasoline > div > span.value
price_1 = soup.select_one("#oilGoldList > li:nth-child(2) > a.head.gasoline > div > span.value").string
print("휘발유 = ", price_1)

#oilGoldList > li:nth-child(3) > a.head.gold_inter > div > span.value
#oilGoldList > li.on > a.head.gold_inter > div > span.value
price_2 = soup.select_one("a.head.gold_inter > div.head_info > span.value").string
print("국제금 = ", price_2)

#oilGoldList > li:nth-child(4) > a.head.gold_domestic > div > span.value
#oilGoldList > li.on > a.head.gold_domestic > div > span.value
price_3 = soup.select_one("a.head.gold_domestic > div.head_info > span.value").string
print("국내금 = ", price_3)