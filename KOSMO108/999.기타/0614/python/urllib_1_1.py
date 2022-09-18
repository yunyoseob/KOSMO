import urllib.request

url = "http://192.168.219.152:8088/kosmoSpring/img/img_mandu/ase.gif"
savename="./data/ase.gif"
urllib.request.urlretrieve(url, savename)
print("저장되었습니다......")