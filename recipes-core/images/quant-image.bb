SUMMARY = "myEngineering Image for Quantinuum"

IMAGE_INSTALL = "\
	packagegroup-myeng		\
	packagegroup-core-boot 		\
	${ROOTFS_PKGMANAGE_BOOTSTRAP} 	\
	${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE_append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "" ,d)}"
