import HTMLTestRunner
import os.path
import sys
import unittest

from selenium import webdriver
import time

import ojUnittest


def creatsuite():
    suite = unittest.TestSuite()
    suite.addTest(unittest.makeSuite(ojUnittest.ojUnittest))
    return suite

if __name__ == "__main__":
    suite = creatsuite()

    cur = sys.path[0]
    time = time.strftime("%Y-%m-%d %H %M %S",time.localtime(time.time()))
    if not os.path.exists(cur + '/resultreport'):
        os.makedirs(cur + "/resultreport")
    filename = cur + "/resultreport/" + time + "resultreport.html"
    with open(filename,"wb") as f:
        runner = HTMLTestRunner.HTMLTestRunner(stream=f,title=u"测试报告",description=u'测试报告',verbosity=2)
        runner.run(suite)

