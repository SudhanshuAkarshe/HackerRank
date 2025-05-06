def print_formatted(number):
    for num in range(number):
        print(num+1,'',oct(num+1).lstrip('0o'),'',hex(num+1).lstrip('0x'),' ',bin(num+1).lstrip('0b'))



