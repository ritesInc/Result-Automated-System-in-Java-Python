
import cv2
cam = cv2.VideoCapture(0)
path="C:\\Users\\root\\Documents\\NetBeansProjects\\ResultSystem\\build\\classes\\resultsystem\\haarcascade_frontalface_default.xml"
detector=cv2.CascadeClassifier(path)

path_for_dataSet = "C:\\Users\\root\\Documents\\NetBeansProjects\\ResultSystem\\build\\classes\\resultsystem\\dataSet"

path_for_id_java = "C:\\Users\\root\\Documents\\NetBeansProjects\\ResultSystem\\build\\classes\\resultsystem\\student_id.txt"
student_roll = open(path_for_id_java, 'r')
Id = student_roll.read()

path_for_class_java = "C:\\Users\\root\\Documents\\NetBeansProjects\\ResultSystem\\build\\classes\\resultsystem\\student_class_java.txt"
student_std = open(path_for_class_java, 'r')
student_class = student_std.read()

sampleNum=0
while(True):
    ret, img = cam.read()
    gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
    faces = detector.detectMultiScale(gray, 1.3, 5)
    for (x,y,w,h) in faces:
        cv2.rectangle(img,(x,y),(x+w,y+h),(255,0,0),2)
        
        #incrementing sample number 
        sampleNum=sampleNum+1
        #saving the captured face in the dataset folder
        cv2.imwrite(path_for_dataSet+"/"+ student_class +Id +'.'+ str(sampleNum) + ".jpg", gray[y:y+h,x:x+w])

        cv2.imshow('frame',img)
    #wait for 100 miliseconds 
    if cv2.waitKey(100) & 0xFF == ord('q'):
        break
    # break if the sample number is morethan 20
    elif sampleNum>20:
        break
cam.release()
cv2.destroyAllWindows()

