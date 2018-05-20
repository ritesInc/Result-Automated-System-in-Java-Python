import cv2
#import numpy as np

recognizer = cv2.face.LBPHFaceRecognizer_create()
path_for_xml="C:\\Users\\root\\Documents\\NetBeansProjects\\ResultSystem\\build\\classes\\resultsystem\\haarcascade_frontalface_default.xml"
path_for_trainer = "C:\\Users\\root\\Documents\\NetBeansProjects\\ResultSystem\\build\\classes\\resultsystem\\trainner\\trainner.yml"

recognizer.read(path_for_trainer)
faceCascade = cv2.CascadeClassifier(path_for_xml);


cam = cv2.VideoCapture(0)
font = cv2.FONT_HERSHEY_SIMPLEX
Id = ""
while True:
    ret, im =cam.read()
    gray=cv2.cvtColor(im,cv2.COLOR_BGR2GRAY)
    faces=faceCascade.detectMultiScale(gray, 1.2,5)
    for(x,y,w,h) in faces:
        cv2.rectangle(im,(x,y),(x+w,y+h),(225,0,0),2)
        Id, conf = recognizer.predict(gray[y:y+h,x:x+w])
        if(conf>500):
            Id="Unknown"        #conf is number of students in school

        #cv2.PutText(cv2.fromarray(im),str(Id), (x,y+h),font, 255)
    cv2.imshow('Face Recognizer',im) 
    if(Id != ""):
        break

path_for_class_roll_python = "C:\\Users\\root\\Documents\\NetBeansProjects\\ResultSystem\\build\\classes\\resultsystem\\studentID.txt"
fo = open(path_for_class_roll_python, "w")
fo.write(str(Id));
fo.close()
   
cam.release()
cv2.destroyAllWindows()
