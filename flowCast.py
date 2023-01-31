# Print all odd numbers from 0 to 100.

# Create a function that returns odd numbers
#   - function takes a min and a max as parameters
#   - returns a list of numbers

# What could you return instead of a list that would allow the function to handle large values and return in constant time?

from pytube import YouTube


def odd_numbers(lower_bound,upper_bound):

    # list_of_odd_numbers = []
    # for odd_number in range(lower_bound,upper_bound + 1):
    #     if odd_number % 2 == 1:
    #         # list_of_odd_numbers.append(odd_number)
    #         yield odd_number
    #     else:
    #         pass
    # return list_of_odd_numbers
    for num in range(lower_bound if lower_bound % 2 else lower_bound + 1, upper_bound + 1, 2):
        yield num

if __name__ == '__main__':
    # for odd_num in odd_numbers(0,10):
    #     print(odd_num)
    # yt = YouTube('https://www.youtube.com/watch?v=auZhQZAG2-E')
    yt = YouTube('')
    stream = yt.streams.get_by_itag(140)#.filter(only_audio=True)
    # print(stream)
    stream.download()