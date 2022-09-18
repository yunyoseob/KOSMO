from bs4 import BeautifulSoup

fp = open("beausoup_frvege.html", encoding="utf-8")
soup = BeautifulSoup(fp, "html.parser")

print(soup.select_one("ul:nth-of-type(2) > li:nth-of-type(4)").string)
print(soup.select_one("#ve-list > li:nth-of-type(4)").string)
print(soup.select("#ve-list > li[data-lo='us']")[1].string)
print(soup.select("#ve-list > li.black")[1].string)

cond = {"data-lo":"us", "class":"black"}
print(soup.find("li", cond).string)

print(soup.find(id="ve-list").find("li", cond).string)