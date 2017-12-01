for i=1,100,1 do
	print((i%3==0 and i%5==0) and "FizzBuzz" or (i%3==0) and "Fizz" or (i%5==0) and "Buzz" or i)
end