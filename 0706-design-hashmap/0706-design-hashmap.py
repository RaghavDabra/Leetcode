class MyHashMap:

    def __init__(self):
        self.BUCKET_SIZE = 1000
        self.buckets = [[] for _ in range(self.BUCKET_SIZE)]  # bucket[i] stores a list of (key, value)

    def getBucket(self, key):
        return self.buckets[key % self.BUCKET_SIZE]

    def findIndexOfKey(self, bucket, key):
        for i, (k, v) in enumerate(bucket):
            if k == key:
                return i
        return -1

    def put(self, key: int, value: int) -> None:
        bucket = self.getBucket(key)
        index = self.findIndexOfKey(bucket, key)
        if index != -1:
            bucket[index][1] = value
        else:
            bucket.append([key, value])

    def get(self, key: int) -> int:
        bucket = self.getBucket(key)
        index = self.findIndexOfKey(bucket, key)
        if index == -1: return -1
        return bucket[index][1]

    def remove(self, key: int) -> None:
        bucket = self.getBucket(key)
        index = self.findIndexOfKey(bucket, key)
        if index == -1: return
        del bucket[index]