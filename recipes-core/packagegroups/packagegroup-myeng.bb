SUMMARY = "myEngineering packagegroup"
LICENSE = "MIT"
PR = "r1"

#
# packages which content depend on MACHINE_FEATURES need to be MACHINE_ARCH
#
PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS_${PN} = " \
	quantinuum"

RRECOMMENDS_${PN} = "\
    quantinuum"

IMAGE_INSTALL_append = "\
	packagegroup-myeng \
"
