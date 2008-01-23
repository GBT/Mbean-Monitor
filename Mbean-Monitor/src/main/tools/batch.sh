#!/bin/sh

if [ $# -ne 1 ] ; then
   echo "ERREUR : Usage ${0} Repertoire_de_collecte"
   exit 1
fi

rep="${1}"

if [ ! -d "${rep}" ] ; then 
   echo "ERREUR : Le repertoire ${rep} n'existe pas"
   exit 1
fi

. setclasspath.sh

java -cp ${CLASSPATH} org.sourceforge.mbeanmonitoring.report.BatchGraph ${rep}
