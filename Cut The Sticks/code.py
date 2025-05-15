def cutTheSticks(arr):
    result = []
    arr = sorted(arr)
    
    while arr:
        result.append(len(arr))
        min_stick = arr[0]
        arr = [x - min_stick for x in arr if x - min_stick > 0]
    
    return result
