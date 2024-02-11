def solution(skill, skill_trees):
    skill_arr = list(skill)
    before_check = {skill_arr[0]: None}
    for i in range(1, len(skill_arr)):
        before_check[skill_arr[i]] =skill_arr[i-1]
    
    answer = 0
    for skill_set in skill_trees:
        skill_order = {key:False for key in skill_arr}
        flag = True
        for skill in skill_set:
            if skill in skill_order and before_check[skill] == None:
                skill_order[skill] = True
            elif skill in skill_order:
                if skill_order[before_check[skill]]:
                    skill_order[skill] = True
                else:
                    flag = False
                    break
        if flag:
            answer += 1
    return answer