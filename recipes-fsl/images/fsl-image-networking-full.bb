require fsl-image-networking.bb

SUMMARY = "Large image to be used for development and evaluation"
DESCRIPTION = "Large image which includes all the tested tools and \
NXP specific packages. It is a full Linux system for development and \
evaluation tasks."

LICENSE = "MIT"

# copy the manifest and the license text for each package to image
COPY_LIC_MANIFEST = "1"

IMAGE_INSTALL_append_qoriq = " \
    packagegroup-core-buildessential \
    packagegroup-core-eclipse-debug \
    packagegroup-core-full-cmdline \
    packagegroup-core-nfs-server \
    packagegroup-core-tools-debug \
    packagegroup-virtualization-docker \
    packagegroup-virtualization-libvirt \
    packagegroup-virtualization-lxc \
    packagegroup-virtualization-qemu \
"

IMAGE_FSTYPES_qoriq = "tar.gz"
