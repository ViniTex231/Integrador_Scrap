from selenium import webdriver
from selenium.webdriver.common.by import By
from time import sleep
import pandas as pd

class Web:
    def __init__(self):
        self.site = "file:///C:/Users/45027278810/Documents/Vini%20-%20LIMA/Integrador_Site-main/shop.html"
        self.map = {
            "desc": {
                'xpath': '/html/body/section[3]/div/div[%VARIAVEL%]/div/h5'
            },
            "valor": {
                'xpath': '/html/body/section[3]/div/div[%VARIAVEL%]/div/h4'
            }
        }
        options = webdriver.EdgeOptions()
        options.add_argument("--headless")
        self.driver = webdriver.Edge(options=options)
        self.abrir_site()
        
    
    def abrir_site(self):
        self.driver.get(self.site)
        data = []
        for i in range(9):
            desc = self.driver.find_element(By.XPATH, self.map["desc"]['xpath'].replace('%VARIAVEL%', f'{i+1}')).text
            preco = self.driver.find_element(By.XPATH, self.map["valor"]['xpath'].replace('%VARIAVEL%', f'{i+1}')).text
            data.append({"Descricao":desc, "Preco":preco})
            print(desc)
            print(preco)

        df = pd.DataFrame(data)
        df.to_csv("output.csv", index=False)    
            
Web()
            
