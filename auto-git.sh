#!/bin/bash
path=/home/taoey/mywork/java/eclipse-workspace/Mybatis3-demos
time=`date +%Y%m%d-%H%M`
cd $path

echo "please input comment"
read comment


#for update
git add .
git commit -m "$time:$comment"
git push -f -u origin
