import requests
import json

# OpenWeatherMap 날씨 정보
# https://openweathermap.org/api
# https://home.openweathermap.org/users/sign_in
# http://bulk.openweathermap.org/sample/city.list.json.gz

# 국내 웹 API
# http://www.apistore.co.kr/api/apiList.do
# http://mashup.or.kr/business/main/main.do
# https://developers.naver.com/main
# https://developers.daum.net
# http://api.danawa.com/main/index.html
# http://developer.auction.co.kr/information.aspx?menu=sub1

# 웹 서비스 : 특정 인증키
# RESTful : 레스트풀 : 레스트 api
# http 프로토콜에서 GET 방식으로 요청하면서 인증키를 사용하는 방법
# 요청하는 문서에 대한 인증키 : 식별자 :  URI
# key=value : header 에 전송하는 방식
# application/x-www-form-urlencoded
# 보안에 아주 취약하다.

"""
http://www.weather.go.kr/images/icon/NW/NB01.png	//맑음    			
http://www.weather.go.kr/images/icon/NW/NB02.png    //구름조금
http://www.weather.go.kr/images/icon/NW/NB03.png    //구름
http://www.weather.go.kr/images/icon/NW/NB03.png    //구름
http://www.weather.go.kr/images/icon/NW/NB20.png	//비조금
http://www.weather.go.kr/images/icon/NW/NB08.png	//비
http://www.weather.go.kr/images/icon/NW/NB14.png	//뇌우
http://www.weather.go.kr/images/icon/NW/NB11.png	//눈
http://www.weather.go.kr/images/icon/NW/NB15.png	//안개
"""


apikey = "474d59dd890c4108f62f192e0c6fce01"

cities = ["Seoul,KR", "Tokyo,JP", "New York,US"]
api = "http://api.openweathermap.org/data/2.5/weather?q={city}&APPID={key}"
print(api)

# 켈빈 온도를 섭씨 온도로 변환하는 함수
k2c = lambda k: k - 273.15
print(k2c)

for name in cities:
    url = api.format(city=name, key=apikey)
    r = requests.get(url)
    data = json.loads(r.text)
    print("+ 도시 =", data["name"])
    print(": 날씨 =", data["weather"][0]["description"])
    print(": 최저 기온 =", k2c(data["main"]["temp_min"]))
    print(": 최고 기온 =", k2c(data["main"]["temp_max"]))
    print(": 습도 =", data["main"]["humidity"])
    print(": 기압 =", data["main"]["pressure"])
    print(": 풍향 =", data["wind"]["deg"])
    print(": 풍속 =", data["wind"]["speed"])
    print("")