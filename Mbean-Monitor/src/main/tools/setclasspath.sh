#!/bin/sh

if [ -z ${JBOSS_HOME} ] ; then 
   echo "ERREUR : La variable JBOSS_HOME n'est pas positionnee"
   exit 1
fi

if [ ! -d ${JBOSS_HOME} ] ; then 
   echo "ERREUR : La variable JBOSS_HOME ne pointe pas sur une installation valide de JBOSS"
   exit 1
fi

BASEDIR=$(dirname `pwd`)
export CLASSPATH=${BASEDIR}/mbeanmonitoring-1.0-alpha.jar
export CLASSPATH=${CLASSPATH}:${JBOSS_HOME}/client/jbossall-client.jar
export CLASSPATH=${CLASSPATH}:${JBOSS_HOME}/server/all/lib/jboss-management.jar
export CLASSPATH=${CLASSPATH}:${JBOSS_HOME}/client/log4j.jar


for jar in $(ls -1 ${BASEDIR}/lib/*.jar) 
do
   CLASSPATH=${CLASSPATH}:${jar}
done


