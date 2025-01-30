num_stat = int(input())
besttime = num_stat
def printprinter(available_printers,num_statues,daysused):
    global besttime
    if available_printers <= num_stat and besttime>=daysused:
        if num_stat == num_statues:
            if daysused < besttime:
                besttime = daysused
        elif num_stat > num_statues:
            printprinter(available_printers,num_statues+available_printers,daysused+1)
            for i in range(available_printers):
                printprinter(available_printers+i+1,num_statues+available_printers-(i+1),daysused+1)
printprinter(1,0,0)
print(besttime)