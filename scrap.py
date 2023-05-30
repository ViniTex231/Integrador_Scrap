from selenium import webdriver
from selenium.webdriver.common.by import By
from time import sleep

class Web:
    def __init__(self):
        self.site = "file:///S:/PM/ter/ets/Inter_Setor/COMPARTILHADO/APRENDIZES/DIGITAL_SOLUTIONS_07/VINICIUS_MARQUES_TEIXEIRA/Integrador_Site-main/shop.html"
        self.map = {
            "desc": {
                'xpath': '/html/body/section[3]/div/div[%VARIAVEL%]/div/h5'
            },
            "valor": {
                'xpath': '/html/body/section[3]/div/div[%VARIAVEL%]/div/h4'
            }
        }
        options = webdriver.ChromeOptions()
        options.add_argument("--headless")
        self.driver = webdriver.Chrome(options=options)
        self.abrir_site()
        
    
    def abrir_site(self):
        self.driver.get(self.site)
        sleep(5)
        for i in range(9):
            desc = self.driver.find_element(By.XPATH, self.map["desc"]['xpath'].replace('%VARIAVEL%', f'{i+1}')).text
            preco = self.driver.find_element(By.XPATH, self.map["valor"]['xpath'].replace('%VARIAVEL%', f'{i+1}')).text
            print(desc)
            print(preco)
            
Web()
            