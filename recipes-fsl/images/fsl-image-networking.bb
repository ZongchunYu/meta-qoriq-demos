# Copyright (C) 2017 NXP Semiconductors
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "The networking image  used by NXP Community to provide networking packages"
SUMMARY = "NXP Community Package - networking"

require fsl-image-networking-minimal.bb

LICENSE = "MIT"

IMAGE_INSTALL_append_qoriq = " \
    bc \
    chkconfig \
    cronie \
    db \
    debianutils \
    dtc \
    lsof \
    man \
    man-pages \
    oprofile \
    parted \
    perf \
    rng-tools \
    rt-tests \
    sqlite3 \
    strongswan \
    texinfo \
    u-boot-mkimage \
    unzip \
    usbutils \
    watchdog \
    which \
    xz  \
    zip \
"
IMAGE_INSTALL_append_qoriq = " \
    bind \
    curl \
    dhcp-client \
    libnfnetlink \
    linuxptp \
    ntpdate \
    ppp \
    ppp-dialin \
    ptpd \
    resolvconf \
    rp-pppoe \
    samba \
    wget \
    xinetd \
"
