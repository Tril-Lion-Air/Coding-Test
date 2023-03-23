from collections import deque


def solution(queue1, queue2):
    answer = 0
    queue1 = deque(queue1)
    queue2 = deque(queue2)
    limit = (len(queue1)) * 4
    tot1 = sum(queue1)
    tot2 = sum(queue2)
    total = tot1 + tot2

    if total % 2 != 0:
        return -1

    while True:
        if tot1 > tot2:
            target = queue1.popleft()
            queue2.append(target)
            tot1 -= target
            tot2 += target
            answer += 1
        elif tot1 < tot2:
            target = queue2.popleft()
            queue1.append(target)
            tot1 += target
            tot2 -= target
            answer += 1
        else:
            break
        if answer == limit:
            answer = -1
            break
    return answer
# #1초당 2000만회 연산가능
# #5초에 1억회

# from collections import deque

# def solution(queue1, queue2):
    
#     queue1 = deque(queue1)
#     queue2 = deque(queue2)
#     limit = len(queue1) * 4
#     cnt = 0
    
#     if (sum(queue1) + sum(queue2))%2 != 0: # 총 합이 홀수이면 절대 답을 낼 수 없음.
#         return -1
    
#     for i in range(len(queue1)*2): # 충분한 횟수만큼 반복
#         if sum(queue1) > sum(queue2):
#             queue2.append(queue1.popleft()) # 큰큐에서 작은큐로 숫자 이동시킴
#             cnt += 1
#         elif sum(queue1) < sum(queue2):
#             queue1.append(queue2.popleft())
#             cnt += 1
#         else: # 두개의 큐가 같을 때
#             return cnt
    
#     return -1