import pyqrcode
from PIL import Image
import random

big_code = pyqrcode.create(str(random.randint(1000,9999)), error='L', version=5, mode='binary')
big_code.png('code.png', scale=6, module_color=[0, 0, 0, 128], background=[0xff, 0xff, 0xcc])
big_code.show()
