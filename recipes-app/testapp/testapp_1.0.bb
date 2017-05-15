DESCRIPTION = "Qunatinuum platform main application"
SECTION = "app"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96af5705d6f64a88e035781ef00e98a8"

DEPENDS = ""

PR = "r1"
SRCREV = "2a86d5b1b9886182523df6b5a0d81c2c4d13ee91"
SRC_URI = "git://github.com/fh666z/quantinuum-app.git;protocol=git;"


S = "${WORKDIR}/git"

inherit autotools

# The autotools configuration I am basing this on seems to have a problem with a race condition when parallel make is enabled
PARALLEL_MAKE = ""
