#!/bin/sh

if [ $# -ne 1 ] ; then
   echo "ERREUR : Usage ${0} fichier_de_conf.xml"
   exit 1
fi

conf="${1}"

if [ ! -f "${conf}" ] ; then 
   echo "ERREUR : Le fichier ${conf} n'existe pas"
   exit 1
fi

BASEDIR="$(dirname $0)"
. ${BASEDIR}/setclasspath.sh

java -cp ${CLASSPATH} org.sourceforge.mbeanmonitoring.report.Graph ${conf}

