import Data.Char

upper_case :: [Char] -> [Char]
upper_case [] = []
upper_case (char:chars) = [toUpper char] ++ (upper_case chars)
main = putStrLn (upper_case "hello")