def solution(phone_book):
    phone_book.sort() # 접두어 자리수가 작기에 오른차순으로 정리해야한다.
    phone_set = set()
    for phone_number in phone_book:
        for i in range(1, len(phone_number)):
            if phone_number[:i] in phone_set: # 중복되는 접두사가 있다면.
                return False
        phone_set.add(phone_number) # 시작번호부터 시작해서 겹치는 부분이 없기에 통과~
    return True