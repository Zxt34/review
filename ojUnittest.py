import unittest

from selenium import webdriver
import time

class ojUnittest(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Chrome()
        self.url = "http://localhost:8080/my_oj/index.html"
        self.driver.maximize_window()

    def tearDown(self):
        self.driver.quit()

    @unittest.skip("skipping")
    def test_link(self):
        driver = self.driver
        driver.get(self.url)
        driver.find_element_by_link_text("Gitee 链接").click()
        driver.implicitly_wait(5)
        js = "var q = document.documentElement.scrollTop = 1000"
        driver.execute_script(js)
        time.sleep(2)
        js = "var q = document.documentElement.scrollTop = 0"
        driver.execute_script(js)
        time.sleep(2)
        driver.back()
        driver.implicitly_wait(5)

    def test_enter(self):
        driver = self.driver
        driver.get(self.url)
        js = "var q = document.documentElement.scrollTop = 1000"
        driver.execute_script(js)
        time.sleep(2)
        driver.find_element_by_xpath('//*[@id="tables"]/div/div/table/tbody/tr').click()
        time.sleep(3)

    def test_editorAndSubmit(self):
        driver = self.driver
        driver.get(self.url)
        js = "var q = document.documentElement.scrollTop = 1000"
        driver.execute_script(js)
        time.sleep(2)
        driver.find_element_by_xpath('//*[@id="tables"]/div/div/table/tbody/tr').click()
        time.sleep(3)
        driver.find_element_by_xpath('//*[@id="editor"]/div[2]/div').click()
        time.sleep(2)
        driver.find_element_by_xpath('//*[@id="app"]/div/div[2]/div/button').click()
        time.sleep(2)
        driver.switch_to.alert.accept()
        time.sleep(3)

if __name__ == "__main__":
    unittest.main(verbosity=2)