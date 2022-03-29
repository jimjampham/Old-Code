from tkinter import *

def button_click(n):

	curr = text_box.get()
	text_box.delete(0, END)
	text_box.insert(0, str(curr) + str(n))

def button_add():
	global first_numb

	first_numb = text_box.get()
	int(first_numb)
	text_box.delete(0, END)

def button_equal():
	second_numb = text_box.get()
	text_box.delete(0, END)
	text_box.insert(0, int(second_numb) + int(first_numb))


root = Tk()

text_box = Entry(root, width = 50, borderwidth = 5)
text_box.grid(row = 0, column = 1, columnspan = 3, padx = 10, pady = 15)




button_0 = Button(root, text = 0, padx = 50, pady = 40, command = lambda: button_click(0))
button_1 = Button(root, text = 1, padx = 50, pady = 40, command = lambda: button_click(1))
button_2 = Button(root, text = 2, padx = 50, pady = 40, command = lambda: button_click(2))
button_3 = Button(root, text = 3, padx = 50, pady = 40, command = lambda: button_click(3))
button_4 = Button(root, text = 4, padx = 50, pady = 40, command = lambda: button_click(4))
button_5 = Button(root, text = 5, padx = 50, pady = 40, command = lambda: button_click(5))
button_6 = Button(root, text = 6, padx = 50, pady = 40, command = lambda: button_click(6))
button_7 = Button(root, text = 7, padx = 50, pady = 40, command = lambda: button_click(7))
button_8 = Button(root, text = 8, padx = 50, pady = 40, command = lambda: button_click(8))
button_9 = Button(root, text = 9, padx = 50, pady = 40, command = lambda: button_click(9))
button_add = Button(root, text = "+", padx = 49, pady = 40, command = button_add)
button_equal = Button(root, text = "=", padx = 50, pady = 40, command = button_equal)

button_0.grid(row = 2, column = 1)
button_1.grid(row = 2, column = 2)
button_2.grid(row = 2, column = 3)
button_3.grid(row = 3, column = 1)
button_4.grid(row = 3, column = 2)
button_5.grid(row = 3, column = 3)
button_6.grid(row = 4, column = 1)
button_7.grid(row = 4, column = 2)
button_8.grid(row = 4, column = 3)
button_9.grid(row = 5, column = 1)
button_add.grid(row = 5, column = 2)
button_equal.grid(row = 5, column = 3)

root.mainloop()