def calc_mean(num):
    total = sum(num)
    n = len(num)
    avg = total / n
    return avg

mean = calc_mean([15,12,20,25])
print("Mean is: ",mean)
